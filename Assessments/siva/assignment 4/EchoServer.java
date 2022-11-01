import java.io.*;
import java.net.*;
public class EchoServer
{
public class EchoServer
{
public EchoServer(int portnum)
{
try
{
server= new ServerSocket(portum);
}
catch(Exception err)
{
System.out.println(err);
}
 