package mypkg;


import mypkg.service.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

@Path("/messages")
public class MessageResourceController {

    MessageService messageService = new MessageService();

    /*
    @GET
    @Path("/xml")
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}/xml")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("messageId") int id) {
        return messageService.getMessage(id);
    }
    */

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("/{messageId}/json")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") int id) {
        return messageService.getMessage(id);
    }

}
