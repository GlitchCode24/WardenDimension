package com.glitched.wardendimension;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static void init(){}
    public static Item register(Item item,String id) {
        return Registry.register(Registries.ITEM, Identifier.of(WardenDimension.MOD_ID,id),item);
    }
    public static final Item WARDEN_CORE = register(new Item(new Item.Settings().maxCount(1)),"warden_core");

}
