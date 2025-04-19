package net.progodaris.arabduckmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.progodaris.arabduckmod.ArabDuckMod;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DUCK_BLOCK = tag("duck_block");

        public static final TagKey<Block> DUCK_ORES = tag("duck_ores");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.tryBuild(ArabDuckMod.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.tryBuild(ArabDuckMod.MOD_ID, name));
        }
    }
}
