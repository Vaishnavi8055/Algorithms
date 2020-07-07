<h1>Algorithms</h1>

<h2>Characterstics of an Algorithm</h2>
<ul>
<li><i>Time Efficiency</i></li>
<p>The size of an array to sort is very important for efficiency. 
If we want to sort an array consisting of a few dozen elements, we can use any sorting algorithm. 
But what if the array contains a lot of data? In that case, we should use only the effective sorting algorithms, otherwise, the results might take too long.</p>
<li><i>Stability</i></li>
<p>An array to sort may contain several identical elements. 
Stable sort algorithms always sort identical elements in the same order as they appear in the input. 
Otherwise, the sorting algorithm is unstable</p>
<li><i>In-place/out-of-place sorting</i></li>
<p>An algorithm performs an in-place sorting if it requires only a constant amount of additional space, otherwise, the algorithm performs an out-of-place sorting. 
The larger the size of the array, the more additional memory is required by the out-of-place algorithms.</p>
<li><i>Internal or external sorting</i></li>
<p>An algorithm performs an internal sorting if sorting data are kept entirely within the main memory of the computer. External sorting is required when the data do not fit into the main memory of the computing device and instead, they must be kept in the slower external memory (usually a hard drive).</p>
</ul>

<hr />

<ol>
<li><b>Insertion Sort</b></li>
<p>It is a simple <b>Sorting Algorithm</b> that performs an <b>in-place</b> sorting.
  It devides the array into sorted and unsorted parts.The Algorithm is <b>Stable</b> , it doesn't change the relative order of identical elements</p>
</ol>

<h3>Time Complexity of Insertion Sort</h3>
<p> O(n^2)  where n = array length </p>





