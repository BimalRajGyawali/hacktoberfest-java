### Huffman coding

Huffman Coding is a lossless compression technique developed by David Huffman.

The output from Huffman's algorithm can be viewed as a variable-length code table for encoding a source symbol (such as a character in a file).

Huffman coding algorithm determines the optimal code using the minimum number of bits.
where , shortest code is assigned to those characters that occuer most frequently.

Example :
Original String - > ABCCCCCCCCDEFGGG<br>
Huffman coding output -> C:0 &nbsp; F:100 &nbsp; A:1010 &nbsp; B:1011 &nbsp; G:110 &nbsp; D:1110  &nbsp; E:1111<br>
EncodedString - >101010110000000011101111100110110110