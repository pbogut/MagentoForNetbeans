/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.smeagol.magento.filetemplates.utils;

/**
 *
 * @author smeagol
 */
public class StringModifier {

    public static String lcFirst(String text) {
        char c[] = text.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        return new String(c);
    }
}
