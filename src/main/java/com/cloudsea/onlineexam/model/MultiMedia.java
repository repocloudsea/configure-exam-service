package com.cloudsea.onlineexam.model;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by deepas on 24/04/17.
 */
public class MultiMedia {

    private String mediaType;

    private String mediaName;

    private BigDecimal mediaSize;

    private String extension;

    private byte[] mediaContent;

    public MultiMedia(String mediaType, String mediaName, BigDecimal mediaSize, String extension, byte[] mediaContent) {
        this.mediaType = mediaType;
        this.mediaName = mediaName;
        this.mediaSize = mediaSize;
        this.extension = extension;
        this.mediaContent = mediaContent;
    }

    public MultiMedia() {
    }

    @Override
    public String toString() {
        return "MultiMedia{" +
                "mediaType='" + mediaType + '\'' +
                ", mediaName='" + mediaName + '\'' +
                ", mediaSize=" + mediaSize +
                ", extension='" + extension + '\'' +
                ", mediaContent=" + Arrays.toString(mediaContent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MultiMedia)) return false;

        MultiMedia that = (MultiMedia) o;

        if (!mediaType.equals(that.mediaType)) return false;
        if (!mediaName.equals(that.mediaName)) return false;
        if (mediaSize != null ? !mediaSize.equals(that.mediaSize) : that.mediaSize != null) return false;
        if (!extension.equals(that.extension)) return false;
        return Arrays.equals(mediaContent, that.mediaContent);
    }

    @Override
    public int hashCode() {
        int result = mediaType.hashCode();
        result = 31 * result + mediaName.hashCode();
        result = 31 * result + (mediaSize != null ? mediaSize.hashCode() : 0);
        result = 31 * result + extension.hashCode();
        result = 31 * result + Arrays.hashCode(mediaContent);
        return result;
    }

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public String getMediaName() {
		return mediaName;
	}

	public void setMediaName(String mediaName) {
		this.mediaName = mediaName;
	}

	public BigDecimal getMediaSize() {
		return mediaSize;
	}

	public void setMediaSize(BigDecimal mediaSize) {
		this.mediaSize = mediaSize;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public byte[] getMediaContent() {
		return mediaContent;
	}

	public void setMediaContent(byte[] mediaContent) {
		this.mediaContent = mediaContent;
	}
    
    
}
