package org.crosswire.common.config;

import org.crosswire.common.util.Logger;

/**
 * A class to convert between strings and objects of a type.
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
public class ClassChoice extends AbstractReflectedChoice
{
    /* (non-Javadoc)
     * @see org.crosswire.common.config.Choice#getConvertionClass()
     */
    public Class getConvertionClass()
    {
        return Class.class;
    }

    /* (non-Javadoc)
     * @see org.crosswire.common.config.AbstractReflectedChoice#convertToString(java.lang.Object)
     */
    public String convertToString(Object orig)
    {
        if (orig == null)
        {
            return null;
        }

        return ((Class) orig).getName();
    }

    /* (non-Javadoc)
     * @see org.crosswire.common.config.AbstractReflectedChoice#convertToObject(java.lang.String)
     */
    public Object convertToObject(String orig)
    {
        try
        {
            return Class.forName(orig);
        }
        catch (ClassNotFoundException ex)
        {
            log.warn("Class not found: "+orig, ex); //$NON-NLS-1$
            return null;
        }
    }

    /**
     * The log stream
     */
    private static final Logger log = Logger.getLogger(ClassChoice.class);
}