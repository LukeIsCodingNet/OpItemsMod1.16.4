package net.lukeiscoding.forge.opitemsmod.tools;

import net.lukeiscoding.forge.opitemsmod.registry.RegisterItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum OpItemsModItemTier implements IItemTier {

    /**
     * @param HarvestLevel
     * 0 = wood or gold
     * 1 = stone
     * 2 = iron
     * 3 = diamond
     */

    // swords...
    DRAGON_SLAYER(69, 4000, 999.9f, 2000.0f, 5, () -> {
        return Ingredient.fromItems(RegisterItems.DRAGON_SLAYER.get());
    }),

    EMERALD_SWORD(3, 200, 8.0f, 16.0f, 5, () -> {
        return Ingredient.fromItems(RegisterItems.EMERALD_SWORD.get());
    }),
    // axes...
    EMERALD_AXE(3, 175, 9.0f, 18.0f, 6, () -> {
        return Ingredient.fromItems(RegisterItems.EMERALD_AXE.get());
    }),
    // pickaxes
    EMERALD_PICKAXE(3, 300, 14.0f, 6.5f, 8, () -> {
        return Ingredient.fromItems(RegisterItems.EMERALD_PICKAXE.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantabillity;
    private final Supplier<Ingredient> repairMaterial;

    OpItemsModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantabillity, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantabillity = enchantabillity;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantabillity;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }
}
