package terrails.statskeeper.potion;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import terrails.statskeeper.StatsKeeper;
import terrails.terracore.potion.PotionBase;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NoAppetiteEffect extends PotionBase {

    public NoAppetiteEffect(String name) {
        super(true, new Color(72, 120, 68).getRGB(), 0, 0);
        setPotionName(StatsKeeper.MOD_ID + "." + name);
        setRegistryName(new ResourceLocation(StatsKeeper.MOD_ID, name));
        setDefaultTextureLocation(StatsKeeper.MOD_ID);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public List<ItemStack> getCurativeItems() {
        return new ArrayList<>();
    }
}