### Run-length Encoding

Run-length encoding (RLE) is a form of lossless data compression in which runs of data (sequences in which the same data value occurs in many consecutive data elements) are stored as a single data value and count, rather than as the original run .
<br>
The reduced sequence of bytes is indicated by a flag byte, that is not the same as the byte being reduced.

Original String&nbsp;&nbsp; - > &nbsp; ABCCCCCCCCDEFGGG
<br>
EncodedString &nbsp;- > &nbsp; ABC!8DEFGGG

In above example ,the byte (!) acts as the flag.

Run length allows the compression of 4 to 259 bytes into three bytes .<br>
But variations of run-length allow it to be used for any length of bytes and without flags as well. 

