package net.progodaris.arabduckmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.progodaris.arabduckmod.ArabDuckMod;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ArabDuckMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }
}
