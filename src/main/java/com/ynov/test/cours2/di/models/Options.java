package com.ynov.test.cours2.di.models;

import java.io.File;

public class Options {

    private final File inFile;
    private final File outFile;
    
    
	public Options(File inFile, File outFile) {
		super();
		this.inFile = inFile;
		this.outFile = outFile;
	}

	public File getInFile() {
		return inFile;
	}

	public File getOutFile() {
		return outFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inFile == null) ? 0 : inFile.hashCode());
		result = prime * result + ((outFile == null) ? 0 : outFile.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Options other = (Options) obj;
		if (inFile == null) {
			if (other.inFile != null)
				return false;
		} else if (!inFile.equals(other.inFile))
			return false;
		if (outFile == null) {
			if (other.outFile != null)
				return false;
		} else if (!outFile.equals(other.outFile))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Options [inFile=" + inFile + ", outFile=" + outFile + "]";
	}

	
    
    
}
