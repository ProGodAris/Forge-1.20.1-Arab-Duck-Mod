package net.progodaris.arabduckmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.progodaris.arabduckmod.ArabDuckMod;
import net.progodaris.arabduckmod.block.ModBlocks;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ArabDuckMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DUCK_BLOCK);
        blockWithItem(ModBlocks.DUCK_BLOCK);

        blockWithItem(ModBlocks.DUCK_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_DUCK_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
