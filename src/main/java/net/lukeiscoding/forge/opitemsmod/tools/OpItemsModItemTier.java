package net.lukeiscoding.forge.opitemsmod.tools;

import net.lukeiscoding.forge.opitemsmod.registry.RegisterItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

/*
Copyright (C) 2022  Luke Is Coding

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

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

    EMERALD_SWORD(3, 4000, 8.0f, 16.0f, 5, () -> {
        return Ingredient.fromItems(RegisterItems.EMERALD_SWORD.get());
    }),

    ZOMBIE_SLASHER(2, 5000, 300.0f, 20.0f, 7, () -> {
        return Ingredient.fromItems(RegisterItems.ZOMBIE_SLASHER.get());
    }),

    RUBY_SWORD(3, 8000, 9.50f, 45.5f, 8, () -> {
        return Ingredient.fromItems(RegisterItems.RUBY_SWORD.get());
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
