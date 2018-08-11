package com.kozja.simpleblockchain;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Digest digest = new Digest();
        Block block = new Block("0", "First block", digest);
        BlockChain blockChain = new BlockChain();
        blockChain.addBlock(block);

        IntStream.range(0, 20).forEach(i -> {
            blockChain.addBlock(new Block(blockChain.getLastBlock().getHash(), "Block #" + i, digest));
        });

        blockChain.display();
    }
}
