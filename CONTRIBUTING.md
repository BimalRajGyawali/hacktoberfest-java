
#### Steps for contribution

1. Fork the repo

2. Clone the forked repo into your local machine <br>
``` bash 
$ git clone https://github.com/your_username/hacktoberfest-java.git
```

3. cd to the repo
```bash
 $ cd hacktoberfest-java 
 ```

4. Create a branch
```bash
    $ git checkout -b mybranch
```

5. Open the repo code using any IDE/text-editors


6. There are different packages for topics such as file, oop, generics, collections and exceptions. Write a program under your desired topic.

7. Add, Commit and Push the changes to your forked repo
``` bash
$ git add .

$ git commit -m "your commit message"

$ git push origin mybranch
```

8. Create a pull request from `mybranch` of your forked repo to `main` branch of this(upstream) repo.

<br>


### Naming Conventions
Name the packages, classes, interfaces, variables, methods and constants following the convention.
<br><br>
<div class="otable-w1">
<table class="otable-w2 otable-tech-basic">    <thead>         <tr>             <th>       <a name="15405" id="15405"></a>            Identifier Type</th>             <th> <a name="15407" id="15407"></a>            Rules for Naming</th>             <th><a name="15409" id="15409"></a>            Examples</th>         </tr>  </thead><tbody>       <tr>             <td>             <p><a name="28840" id="28840"></a> Packages</td>             <td><a name="34793" id="34793"></a> The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981.</p>             <p><a name="28865" id="28865"></a> Subsequent components of the package name vary according to an organization's own internal naming conventions. Such conventions might specify that certain directory name components be division, department, project, machine, or login names.</td>             <td><a name="34962" id="34962"></a> com.sun.eng</p>             <p><a name="34966" id="34966"></a> com.apple.quicktime.v2</p>             <p><a name="34967" id="34967"></a></p>             <p><a name="28894" id="28894"></a> edu.cmu.cs.bovik.cheese</td>         </tr>         <tr>             <td><a name="15411" id="15411"></a> Classes</td>             <td><a name="15413" id="15413"></a> Class names should be nouns, in mixed case with the first letter of each internal word capitalized. Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML).</td>             <td><a name="15415" id="15415"></a> class Raster;             <br>             class ImageSprite;</td>         </tr>         <tr>             <td><a name="15417" id="15417"></a> Interfaces</td>             <td><a name="15419" id="15419"></a> Interface names should be capitalized like class names.</td>             <td><a name="15421" id="15421"></a> interface RasterDelegate;             <br>             interface Storing;</td>         </tr>         <tr>             <td><a name="15423" id="15423"></a> Methods</td>             <td><a name="15425" id="15425"></a> Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.</td>             <td><a name="15427" id="15427"></a> run();             <br>             runFast();             <br>             getBackground();</td>         </tr>         <tr>             <td><a name="15429" id="15429"></a> Variables</td>             <td><a name="34851" id="34851"></a> Except for variables, all instance, class, and class constants are in mixed case with a lowercase first letter. Internal words start with capital letters. Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.</p>             <p><a name="15432" id="15432"></a> Variable names should be short yet meaningful. The choice of a variable name should be mnemonic- that is, designed to indicate to the casual observer the intent of its use. One-character variable names should be avoided except for temporary "throwaway" variables. Common names for temporary variables are               <code class="ocode">i</code>,               <code class="ocode">j</code>,               <code class="ocode">k</code>,               <code class="ocode">m</code>, and               <code class="ocode">n</code> for integers;               <code class="ocode">c</code>,               <code class="ocode">d</code>, and               <code class="ocode">e</code> for characters.</td>             <td><a name="15434" id="15434"></a></p>             <div class="ocode"><pre><code>int             i;

char            c;
float           myWidth;
</code></pre></div></td>         </tr>         <tr>             <td><a name="15436" id="15436"></a> Constants</td>             <td><a name="15438" id="15438"></a> The names of variables declared class constants and of ANSI constants should be all uppercase with words separated by underscores ("_"). (ANSI constants should be avoided, for ease of debugging.)</td>             <td><a name="15440" id="15440"></a> static final int MIN_WIDTH = 4;</p>             <p><a name="18753" id="18753"></a> static final int MAX_WIDTH = 999;</p>             <p><a name="33897" id="33897"></a> static final int GET_THE_CPU = 1;</td>         </tr>     </tbody> </table>  </div></div>    <!-- CN15v0 -->


Reference: https://www.oracle.com/java/technologies/javase/codeconventions-namingconventions.html


