
//Essa vai ser a classe que vai capturar todos os eventos
 public class DiscordListener extends ListenerAdapter
 {
  
    @Override
     public void onReady(ReadyEvent event)
     {
         //Quando o bot estiver pronto, ele vai printar no console que ele esta pronto
         System.out.println("I am ready to go!");
     }

    @Override
     public void onMessageReceived(MessageReceivedEvent event)
     {
        //Essa linha vai pegar o conteudo da mensagem
       String message = event.getMessage().getContent();
        
        //Se a mensagem começar com _ping...
        message.startsWith("_ping")) { 
          //Ele vai me responder com Pong!
              //É Importante deixar .queue();
          event.getTextChannel().sendMessage("Pong!").queue();
          
          
        //Vamos adicionar uma imagem
         //Para isso, vamos usar um bufferedimage
         message.startsWith("_simpleimage") {
            //Vamos criar uma bufferedimage com o tamanho 400 x 300
            BufferedImage base = BufferedImage(400, 300, BufferedImage.TYPE_INT_ARGB);

            //Para facilitar o code 
            Graphics graphics = base.graphics;
            //Vamos colocar a cor do texto de branco
             graphics.setColor = Color(255,255,255);
             //Agora vamos escrever alguma coisa na nossa bufferedimage
              graphics.drawString("Hello World ", 15, 70);
                //Agora vamos configurar a saida da imagem
                 ByteArrayOutputStream os = ByteArrayOutputStream();
                 ImageIO.write(base, "png", os);
                 ByteArrayInputStream inputStream = ByteArrayInputStream(os.toByteArray());
                 //Agora por ultimo vamos enviar a mensagem para o user
               event.textChannel.sendFile(inputStream, "hello.png", MessageBuilder().append("Texto Qualquer").build()).queue();


        }
        }
     }
 }
