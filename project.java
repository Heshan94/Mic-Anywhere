class Server
{
   public static void main(String args[]) throws Exception
      {
         DatagramSocket serverSocket = new DatagramSocket(50005);
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[1024];
            while(true)
               {
                  DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);



              serverSocket.receive(receivePacket);
              String sentence = new String( receivePacket.getData().toString());

              System.out.println("RECEIVED: " + sentence);
           }
  }
}