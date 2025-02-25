package net.arvid.arja.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents
{
    public static final FoodComponent KEBAB = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 200), 0.15f).meat().build();
}
