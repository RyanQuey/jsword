/**
 * Distribution License:
 * JSword is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License, version 2 as published by
 * the Free Software Foundation. This program is distributed in the hope
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * The License is available on the internet at:
 *       http://www.gnu.org/copyleft/gpl.html
 * or by writing to:
 *      Free Software Foundation, Inc.
 *      59 Temple Place - Suite 330
 *      Boston, MA 02111-1307, USA
 *
 * Copyright: 2005
 *     The copyright to this program is held by it's authors.
 *
 * ID: $ID$
 */
package org.crosswire.jsword.book.search.basic;

import org.crosswire.jsword.book.search.SearchModifier;

/**
 * The DefaultSearchModifier provides a simple implementation
 * of a SearchModifier.
 * 
 * @see gnu.gpl.Licence for license details.
 *      The copyright to this program is held by it's authors.
 * @author DM Smith [dmsmith555 at gmail dot com]
 */

public class DefaultSearchModifier implements SearchModifier
{

    /* (non-Javadoc)
     * @see org.crosswire.jsword.book.search.SearchModifier#isRanked()
     */
    public boolean isRanked()
    {
        return ranked;
    }

    /**
     * Set whether or not the search should be ranked.
     * @param newRanked true if the search should be ranked
     */
    public void setRanked(boolean newRanked)
    {
        ranked = newRanked;
    }

    /**
     * The indicator of whether the request should be ranked.
     */
    private boolean ranked;
}
