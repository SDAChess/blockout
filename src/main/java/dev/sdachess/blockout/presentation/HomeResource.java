package dev.sdachess.blockout.presentation;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class HomeResource {
    @CheckedTemplate
    static class Templates {
        static native TemplateInstance home(String name);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance home() {
        return Templates.home("world");
    }
}
