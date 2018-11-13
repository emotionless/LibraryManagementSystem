/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author SHAMS
 */
public class FaceBook{
   public FaceBook(){
       try {
         //Set your page url in this string. For eg, I m using URL for Google Search engine
         String url = "http://www.facebook.com";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException e) {
           System.out.println(e.getMessage());
       }
   }
}
