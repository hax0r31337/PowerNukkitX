package cn.nukkit.block;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;

/**
 * @author LoboMetalurgico
 * @since 11/06/2021
 */

@PowerNukkitOnly
@Since("FUTURE")
public class BlockCopperWaxedOxidized extends BlockCopper {
    @PowerNukkitOnly
    @Since("FUTURE")
    public BlockCopperWaxedOxidized() {

    }

    @Override
    public String getName() {
        return "Waxed Oxidized Copper";
    }

    @Override
    public int getId() {
        return WAXED_OXIDIZED_COPPER;
    }
}
