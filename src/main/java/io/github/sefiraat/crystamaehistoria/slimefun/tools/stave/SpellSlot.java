package io.github.sefiraat.crystamaehistoria.slimefun.tools.stave;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

public enum SpellSlot {
    LEFT_CLICK(1, "左键点击"),
    RIGHT_CLICK(2, "右键点击"),
    SHIFT_LEFT_CLICK(3, "Shift+左键点击"),
    SHIFT_RIGHT_CLICK(4, "Shift+右键点击");

    @Getter
    protected static final SpellSlot[] cashedValues = values();

    @Getter
    private final int slot;
    @Getter
    private final String description;

    SpellSlot(int slot, String description) {
        this.slot = slot;
        this.description = description;
    }

    @Nullable
    public static SpellSlot getBySlot(int slot) {
        for (SpellSlot spellSlot : values()) {
            if (spellSlot.slot == slot) {
                return spellSlot;
            }
        }
        return null;
    }

    @Nullable
    @ParametersAreNonnullByDefault
    public static SpellSlot getByPlayerAndAction(Player player, Action action) {
        if (action == Action.LEFT_CLICK_AIR || action == Action.LEFT_CLICK_BLOCK) {
            return player.isSneaking() ? SpellSlot.SHIFT_LEFT_CLICK : SpellSlot.LEFT_CLICK;
        } else if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            return player.isSneaking() ? SpellSlot.SHIFT_RIGHT_CLICK : SpellSlot.RIGHT_CLICK;
        }
        return null;
    }

}
