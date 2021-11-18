package net.lukeiscoding.forge.opitemsmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {

    public RubyOre() {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(8.0f, 12.f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }
}
