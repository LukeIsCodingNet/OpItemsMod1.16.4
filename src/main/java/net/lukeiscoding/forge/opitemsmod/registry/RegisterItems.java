package net.lukeiscoding.forge.opitemsmod.registry;

import net.lukeiscoding.forge.opitemsmod.OpItemsMod;
import net.lukeiscoding.forge.opitemsmod.items.BaseItem;
import net.lukeiscoding.forge.opitemsmod.items.MaterialItemBase;
import net.lukeiscoding.forge.opitemsmod.tools.OpItemsModArmorMaterial;
import net.lukeiscoding.forge.opitemsmod.tools.OpItemsModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

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

public class RegisterItems {

    // create a deferred register to register items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OpItemsMod.MOD_ID);

    // this method gets called in the constructor of the main mod class to register the stuff we have here.
    public static void registryInit() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // swords...
    public static final RegistryObject<SwordItem> DRAGON_SLAYER = ITEMS.register("dragon_slayer", () ->
            new SwordItem(OpItemsModItemTier.DRAGON_SLAYER, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_SWORDS_TAB).setNoRepair())
    );

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () ->
            new SwordItem(OpItemsModItemTier.EMERALD_SWORD, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_SWORDS_TAB).setNoRepair())
    );

    public static final RegistryObject<SwordItem> ZOMBIE_SLASHER = ITEMS.register("zombie_slasher", () ->
            new SwordItem(OpItemsModItemTier.ZOMBIE_SLASHER, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_SWORDS_TAB))
    );

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(OpItemsModItemTier.RUBY_SWORD, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_SWORDS_TAB))
    );

    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () ->
            new SwordItem(OpItemsModItemTier.STEEL, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_SWORDS_TAB))
    );

    // axes...
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(OpItemsModItemTier.EMERALD_AXE, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_AXES_TAB).setNoRepair())
    );

    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () ->
            new AxeItem(OpItemsModItemTier.STEEL, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_AXES_TAB))
    );

    // pickaxes...
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(OpItemsModItemTier.EMERALD_PICKAXE, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_PICKAXES_TAB).setNoRepair())
    );

    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () ->
            new PickaxeItem(OpItemsModItemTier.STEEL, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_PICKAXES_TAB))
    );

    // hoes...
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () ->
            new HoeItem(OpItemsModItemTier.STEEL, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_HOES_TAB))
    );

    // helmets
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(OpItemsModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(RegisterItemGroups.OP_ARMOR_TAB))
    );

    // chest plates...
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(OpItemsModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(RegisterItemGroups.OP_ARMOR_TAB))
    );

    // leggings...
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(OpItemsModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(RegisterItemGroups.OP_ARMOR_TAB))
    );

    // boots...
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(OpItemsModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(RegisterItemGroups.OP_ARMOR_TAB))
    );

    // items...
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", MaterialItemBase::new);
    public static final RegistryObject<Item> EMERALD_ROD = ITEMS.register("emerald_rod", MaterialItemBase::new);
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", BaseItem::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", BaseItem::new);
    public static final RegistryObject<Item> RUBY_ROD = ITEMS.register("ruby_rod", MaterialItemBase::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", MaterialItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", BaseItem::new);
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", MaterialItemBase::new);
}
