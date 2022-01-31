package net.lukeiscoding.forge.opitemsmod.registry;

import net.lukeiscoding.forge.opitemsmod.OpItemsMod;
import net.lukeiscoding.forge.opitemsmod.items.BaseItem;
import net.lukeiscoding.forge.opitemsmod.items.MaterialItemBase;
import net.lukeiscoding.forge.opitemsmod.tools.OpItemsModItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
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

    // axes...
    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () ->
            new AxeItem(OpItemsModItemTier.EMERALD_AXE, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_AXES_TAB).setNoRepair())
    );

    // pickaxes...
    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () ->
            new PickaxeItem(OpItemsModItemTier.EMERALD_PICKAXE, 0, 0, new Item.Properties().group(RegisterItemGroups.OP_PICKAXES_TAB).setNoRepair())
    );

    // items...
    public static final RegistryObject<Item> EMERALD_NUGGET = ITEMS.register("emerald_nugget", MaterialItemBase::new);
    public static final RegistryObject<Item> EMERALD_ROD = ITEMS.register("emerald_rod", MaterialItemBase::new);
    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", BaseItem::new);
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", BaseItem::new);
    public static final RegistryObject<Item> RUBY_ROD = ITEMS.register("ruby_rod", MaterialItemBase::new);
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", BaseItem::new);
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", MaterialItemBase::new);
}
