/**
 * Created by ntenisOT on 16/10/14.
 */


import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.PlayAuthenticate.Resolver;
import com.feth.play.module.pa.exceptions.AccessDeniedException;
import com.feth.play.module.pa.exceptions.AuthException;
import controllers.routes;
import helper.datasources.MongoDB;
import helper.datasources.MorphiaObject;
import models.SecurityRole;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.mvc.Call;

import java.util.Arrays;

public class Global extends GlobalSettings {

    public void onStart(Application app) {
        Logger.info("Application started!");

        MongoDB.connect();

        Logger.info("Connected to Database!");

        PlayAuthenticate.setResolver(new Resolver() {

            @Override
            public Call login() {
                // Your login page
                return routes.Application.login();
            }

            @Override
            public Call afterAuth() {
                // The user will be redirected to this page after authentication
                // if no original URL was saved
                return routes.Application.index();
            }

            @Override
            public Call afterLogout() {
                return routes.Application.index();
            }

            @Override
            public Call auth(final String provider) {
                // You can provide your own authentication implementation,
                // however the default should be sufficient for most cases
                return com.feth.play.module.pa.controllers.routes.Authenticate
                        .authenticate(provider);
            }

            @Override
            public Call askMerge() {
                return routes.Account.askMerge();
            }

            @Override
            public Call askLink() {
                return routes.Account.askLink();
            }

            @Override
            public Call onException(final AuthException e) {
                if (e instanceof AccessDeniedException) {
                    return routes.Signup
                            .oAuthDenied(((AccessDeniedException) e)
                                    .getProviderKey());
                }

                // more custom problem handling here...
                return super.onException(e);
            }
        });

        initialData();
    }

    public void onStrop(Application app) {
        Logger.info("Appplication stopped!");
        MongoDB.disconnect();
    }

    // Update to add a role

    private void initialData() {

        if (MorphiaObject.datastore.createQuery(SecurityRole.class).countAll() == 0) {
            for (final String roleName : Arrays
                    .asList(controllers.Application.USER_ROLE)) {
                final SecurityRole role = new SecurityRole();
                role.roleName = roleName;
                MorphiaObject.datastore.save(role);
            }
        }
    }
}
