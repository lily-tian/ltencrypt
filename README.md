# ltencrypt

This contains a plain text encryption program using linear-feedback shift register. Enjoy!

### Getting started

To use the encryption, download the zip file provided by github. Please make sure you have all necessary Java programming tools (eg. JDK) installed.

Compile all .java files in the "dependencies" folder. They are LFSR.java and four I/O programs (StdIn.java, StdOut.java, In.java, Out.java) needed for the encryption to run.

Compile LTEncrypt. You may do this by entering your current working directory and entering the following in the command terminal:

```
javac -cp .:./dependencies/ LTEncrypt.java
```

### Using the encryption

To run LTEncrypt, enter the directory LTEncrypt.java is in, and enter the following commands:

```
java -cp .:./dependencies/ LTEncrypt
```

You will be prompted to enter a password. This will be the password you will later use to decrypt the file. Hit enter, then enter a numerical pin, the name of the file you wish to encrypt (eg. "test.txt"), and the name of your encrypted file. This will create your new encrypted file and place it in the same directory as LTEncrypt. Make sure the file you wish to encrypt is in your class path.

To decrypt your file, simply run LTEncrypt again, enter the same password and pin, and input your encrypted file. Name your decrypted file and find it in your working directory.

### Limitations

This encryption program is intended for casual use, such as hiding files from nosy parents (or kids!). Please do not rely on this program to conceal sensitive or confidential information - the LFSR is a linear system and is possible to be hacked. 

Please restrict use to plain text files. Non-ASCII characters may not be supported. Please do not use for rich text files like .rtf, .odt, .doc or .docx as it may simply return corrupt files. 

### Testings

Preliminary testings and debugging are conducted in the test_files folder. This program has not yet undergone thorough testing for corner cases and other issues that may arise.

### Future development

In progress is an encryption implementation for images.

### Languages and software

The programming language used for this project is Java. 

### Authors

[*lily.tian*](https://github.com/PurpleBooth)

### License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

### Acknowledgments

I/O programs are from the standard libraries developed by Robert Sedgewick and Kevin Wayne. This program is based on the LSFR assignment created by Robert Sedgewick in 2008 for the COS126 course at Princeton University. 
