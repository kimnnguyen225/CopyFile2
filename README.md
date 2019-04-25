# Copy Text File

- Java 7 and later
- Copy text file using 
- Path sourceFile = new Paths.get("subdirectory", "originalFile.txt");
- Path targetFile = new Paths.get("subdirectory", "copiedFile.txt"); //Paths's static method get()
- using try/catch to handle IOException and printStackTrace();
- inside try/catch, I use Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING); //means that if the target file is already existed, delete it, and create a new version.
