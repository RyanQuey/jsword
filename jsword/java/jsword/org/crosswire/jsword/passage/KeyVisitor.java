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
package org.crosswire.jsword.passage;

/**
 * An interface for components wanting to visit all the nodes in a Key tree.
 * 
 * @see gnu.gpl.Licence for license details.
 *      The copyright to this program is held by it's authors.
 * @author Joe Walker [joe at eireneh dot com]
 */
public interface KeyVisitor
{
    /**
     * We've found a leaf node in a Key tree, and are giving the visitor a
     * change to do processing based on it.
     * @param key The found leaf node.
     */
    public void visitLeaf(Key key);

    /**
     * We've found a branch node in a Key tree, and are giving the visitor a
     * change to do processing based on it.
     * @param key The found branch node.
     */
    public void visitBranch(Key key);
}
