
package docs;

/**
Some recommendations on coding for this project.

<h3>JDK Versions</h3>
<p>This is all currently being written using JDK 1.3+</p>

<h3>Momentum</h3>
<p>CatB talked about getting people involved -
&quot;Release early and often&quot;, &quot;Mailing Lists&quot; and so on.
I plan to have a menu item &quot;Get involved ...&quot; This will present
a wizard thing to guide people to help. The ways of getting people
involved so far include:
<ul>
  <li>Writing help files</li>
  <li>Writing tips</li>
  <li>Bug reports</li>
  <li>Development requests/ideas</li>
  <li>Packaging offers</li>
  <li>Support/Mentoring other users</li>
  <li>Creating a live lexicon</li>
  <li>Reporting usage data</li>
</ul>

<h3>Coding Standards</h3>
<p>The coding standards used on this project so far are
very much based on the SUN coding standards. This is some notes on style we are
using, some of this deviates from the SUN standard, and some is just extensions
to it.</p>

<h5>Packaging</h5>
<p>There is a split between classes that are specific to this project and those
that could be usefully employed elsewhere. Generally we should:
<ul>
  <li>Make a much code general as possible</li>
  <li>Only generalize where there is a point - specifically and code that does
      something Bible specific should not be general</li>
  <li>Never import specific code in generalized code</li>
</ul>
Generalized code exists in <code>org.crosswire</code>. Code specific to this
project lives in <code>org.crosswire.jsword</code>.</p>

<p>Also, since there is an MVC relationship between various parts of the code
we avoid importing <code>org.crosswire.jsword.view.*</code> in any other code,
and avoid importing <code>org.crosswire.jsword.control.*</code> in anything but
<code>org.crosswire.jsword.view.*</code></p>

<p>Also any code specific to an interface X should be in a package containing
x. For example all swing specific code is in a *swing* package. This helps us
in packaging code for a distribution, in excluding other interfaces.</p>

<h5>Bracket Indentation</h5>
<p>The "Sun Way" conserves screen space at the expense of readibility -
which given the cost of decent size monitors these days seems silly.
Most code I have seen, seems to ignore Sun and do it this way:<br>
<code>if (something)
<br>{
<br>&nbsp;&nbsp;&nbsp;&nbsp;func();
<br>}
</code></p>

<h5>Variable Naming</h5>
<p>Sun recommend using the same convention as for method names. This does
confuse method names and variable names. So the suggested use for this project
is all lower case names with optional underscores between words. For example
<code>word_count</code> or <code>wordcount</code> and not <code>wordCount</code>.
The Sun method makes some sense if you intend to use public member variables,
however that is generally not recommended behavior.</p>

<h5>Class Ordering</h5>
<p>Variables are not important members of a class so why put them at the
top? JSword usage puts them at the bottom.</p>

<h5>Tabbing</h5>
<p>4 space indents are a Good Thing, however using a tab character
instead of 4 spaces just causes problems when you want to print, open in
a different editor, or want to paste into an html doc using &lt;pre&gt;
tags. Everything will look exactly the same if you use spaces instead of
tabs.</p>

 * <p><table border='1' cellPadding='3' cellSpacing='0'>
 * <tr><td bgColor='white' class='TableRowColor'><font size='-7'>
 * Distribution Licence:<br />
 * JSword is free software; you can redistribute it
 * and/or modify it under the terms of the GNU General Public License,
 * version 2 as published by the Free Software Foundation.<br />
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.<br />
 * The License is available on the internet
 * <a href='http://www.gnu.org/copyleft/gpl.html'>here</a>, by writing to
 * <i>Free Software Foundation, Inc., 59 Temple Place - Suite 330, Boston,
 * MA 02111-1307, USA</i>, Or locally at the 'Licence' link below.<br />
 * The copyright to this program is held by it's authors.
 * </font></td></tr></table>
 * @see docs.Licence
 * @author Joe Walker [joe at eireneh dot com]
 * @version $Id$
 */
public class WritingCode
{
}
