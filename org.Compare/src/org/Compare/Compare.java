package org.Compare;

public class Compare {

    // this is path information about the images
    protected String ImagePath1;
    protected String ImagePath2;

    // this is information that tells if they we the same.
    protected boolean Same;

    public boolean Compare(String path1, String path2) {

        return this.Same;
    }

    // returns the locations of each image path
    public String getImagePath1() {
        return this.ImagePath1;
    }

    // returns the locations of each image path
    public String getImagePath2() {
        return this.ImagePath2;
    }
}
