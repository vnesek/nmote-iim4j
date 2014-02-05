IIM4J - IPTC IIM Library for Java
=================================

IIM4J allows Java programmers to read, write and process IPTC IIM version 4 files.
For example, you can read and write metadata contained in JPEG files. 
More information regarding IIM is available on IPTC website, www.iptc.org.

Features
--------
* Supports Java 1.5+
* Full IPTC version 4 compliance
* Bundled subject-reference-system
* No external dependecies at all
* BSD style license

How to use it
-------------

There are few sample programs in a samples directory.

To read JPEG metadata you would do:

```java
	IIMReader reader = new IIMReader(new JPEGIIMInputStream(new FileIIMInputStream(file)),
		new IIMDataSetInfoFactory());

	IIMFile iimFile = new IIMFile();
	iimFile.readFrom(reader, 20);
	
	for (DataSet ds : iimFile.getDataSets()) {
		Object value = ds.getValue();
		DataSetInfo info = ds.getInfo();
		System.out.println(info.toString() + " " + info.getName() + ": " + value);
	}
```

License
-------
IIM4J is released under BSD license. See LICENSE.txt for more information.

Building
--------
To produce nmote-xr.jar you will need apache maven installed. Run:

> mvn clean package

History
-------

* Version 1.0.0. 02.02.2014
  Cleanup, removed external deps, mavenized, generified.

* Version 0.9.1 12.04.2005
  Several bug fixes, feature complete, extended JavaDocs.

* Version 0.9 10.01.2005
  Bug fixes, support for IIM record inside of JPEG
  (Photoshop support), support for multiple encodings.  

* Version 0.8 11.05.2004
  Initial release of project IIM4J on
  Sourceforge under BSD license

Author contact and support
--------------------------
For any further information please contact Vjekoslav Nesek (vnesek@nmote.com)
