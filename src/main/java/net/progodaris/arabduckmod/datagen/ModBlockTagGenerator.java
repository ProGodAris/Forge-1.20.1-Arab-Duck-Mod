package net.progodaris.arabduckmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.progodaris.arabduckmod.ArabDuckMod;
import net.progodaris.arabduckmod.block.ModBlocks;
import net.progodaris.arabduckmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ArabDuckMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.DUCK_ORES)
                .add(ModBlocks.DUCK_ORE.get(),
                    ModBlocks.DEEPSLATE_DUCK_ORE.get()

                ).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DUCK_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DUCK_BLOCK.get(),
                        ModBlocks.DUCK_ORE.get(),
                        ModBlocks.DEEPSLATE_DUCK_ORE.get()
                );
    }
}
