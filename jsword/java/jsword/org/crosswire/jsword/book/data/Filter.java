
package org.crosswire.jsword.book.data;

import javax.xml.bind.Element;

/**
 * A generic interface for things that can convert a String into OSIS data.
 * 
 * <p><table border='1' cellPadding='3' cellSpacing='0'>
 * <tr><td bgColor='white' class='TableRowColor'><font size='-7'>
 *
 * Distribution Licence:<br />
 * JSword is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License,
 * version 2 as published by the Free Software Foundation.<br />
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.<br />
 * The License is available on the internet
 * <a href='http://www.gnu.org/copyleft/gpl.html'>here</a>, or by writing to:
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston,
 * MA 02111-1307, USA<br />
 * The copyright to this program is held by it's authors.
 * </font></td></tr></table>
 * @see gnu.gpl.Licence
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id$
 */
public interface Filter
{
    /**
     * Converter from plain (encoded) text to OSIS data
     * @param ele The element to which to add the data encoded in <code>plain</code>
     * @param plain The encoded text
     * @return Verse OSIS data
     */
    public void toOSIS(Element ele, String plain) throws DataException;

    /**
     * Constant to help narrow down what we use seg for. In this case the italic tag
     */
    public static final String SEG_ITALIC = "font-style: italic;";

    /**
     * Constant to help narrow down what we use seg for. In this case the bold tag
     */
    public static final String SEG_BOLD = "font-weight: bold;";

    /**
     * Constant to help narrow down what we use seg for. In this case the bold tag
     */
    public static final String SEG_UNDERLINE = "text-decoration: underline;";

    /**
     * Constant to help narrow down what we use seg for. In this case the color tag
     */
    public static final String SEG_COLORPREFIX = "color: ";

    /**
     * Constant to help narrow down what we use seg for. In this case the font-size tag
     */
    public static final String SEG_SIZEPREFIX = "font-size: ";
}
