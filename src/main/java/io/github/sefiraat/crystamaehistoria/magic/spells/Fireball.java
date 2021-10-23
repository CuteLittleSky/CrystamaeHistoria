package io.github.sefiraat.crystamaehistoria.magic.spells;

import io.github.sefiraat.crystamaehistoria.magic.CastInformation;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.MagicProjectile;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.SpellCoreBuilder;
import io.github.sefiraat.crystamaehistoria.slimefun.Materials;
import io.github.sefiraat.crystamaehistoria.slimefun.machines.liquefactionbasin.SpellRecipe;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class Fireball extends Spell {

    public Fireball() {
        SpellCoreBuilder spellCoreBuilder = new SpellCoreBuilder(5, true, 0, false, 1, true)
            .makeProjectileSpell(this::fireProjectile, 1, false, 1, false)
            .makeProjectileVsEntitySpell(this::projectileHit)
            .addBeforeProjectileHitEntityEvent(this::beforeProjectileHit)
            .makeDamagingSpell(2, true, 0.5, false);
        setSpellCore(spellCoreBuilder.build());
    }

    @ParametersAreNonnullByDefault
    public void fireProjectile(CastInformation castInformation) {
        Location location = castInformation.getCastLocation();
        Location aimLocation = location.clone().add(0, 1.5, 0).add(location.getDirection().multiply(2));
        MagicProjectile magicProjectile = new MagicProjectile(EntityType.SMALL_FIREBALL, aimLocation, castInformation.getCaster());
        magicProjectile.setVelocity(location.getDirection(), 1.5);
        registerProjectile(magicProjectile, castInformation);
    }

    @ParametersAreNonnullByDefault
    public void beforeProjectileHit(CastInformation castInformation) {
        for (LivingEntity livingEntity : getTargets(castInformation, getProjectileAoe(castInformation), true)) {
            livingEntity.setFireTicks(80);
        }
    }

    @ParametersAreNonnullByDefault
    public void projectileHit(CastInformation castInformation) {
        for (LivingEntity livingEntity : getTargets(castInformation, getProjectileAoe(castInformation), true)) {
            damageEntity(livingEntity, castInformation.getCaster(), getDamage(castInformation), castInformation.getDamageLocation(), getKnockback(castInformation));
        }
    }

    @Nonnull
    @Override
    public String getId() {
        return "FIREBALL";
    }

    @Nonnull
    @Override
    public String[] getLore() {
        return new String[]{
            "Shoots a fireball in the direction you are",
            "looking at."
        };
    }

    @Nonnull
    @Override
    public Material getMaterial() {
        return Material.FIRE_CHARGE;
    }

    @NotNull
    @Override
    public SpellRecipe getRecipe() {
        return new SpellRecipe(
            Materials.INERT_PLATE_T_1,
            StoryType.ELEMENTAL,
            StoryType.HUMAN,
            StoryType.CELESTIAL
        );
    }
}
