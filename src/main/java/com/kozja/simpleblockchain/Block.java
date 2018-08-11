package com.kozja.simpleblockchain;


import java.util.Date;

public class Block {
    private String previousHash;
    private String data;
    private long timestamp;
    private String hash;

    public Block(String previousHash, String data, Digest digest) {
        this.previousHash = previousHash;
        this.data = data;
        timestamp = new Date().getTime();
        hash = digest.apply(previousHash + data + timestamp);
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public String toString() {
        return "Block{" +
                "previousHash='" + previousHash + '\'' +
                ", data='" + data + '\'' +
                ", timestamp=" + timestamp +
                ", hash='" + hash + '\'' +
                '}';
    }
}
