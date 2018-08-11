package com.kozja.simpleblockchain;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {
    private List<Block> blocks = new ArrayList<>();

    public void addBlock(Block block){
        blocks.add(block);
    }

    public Block getLastBlock(){
        return blocks.get(blocks.size()-1);
    }

    public void display(){
        blocks.forEach(System.out::println);
    }
}
