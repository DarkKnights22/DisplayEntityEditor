package goldenshadow.displayentityeditor.items;

import goldenshadow.displayentityeditor.Utilities;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class InventoryItems {

    public static ItemStack gui() {
        ItemStack itemStack = new ItemStack(Material.NETHER_STAR);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Open GUI",
                List.of(
                        ChatColor.GRAY + "Right click to open the GUI of",
                        ChatColor.GRAY + "the nearest unlocked display entity"
                ),
                "InventoryGUI"
                );
        return itemStack;
    }

    public static ItemStack rotateYaw() {
        ItemStack itemStack = new ItemStack(Material.MAGMA_CREAM);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Rotate horizontally (yaw)",
                List.of(
                        ChatColor.GRAY + "Click to rotate the nearest",
                        ChatColor.GRAY + "unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to rotate by +1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to rotate by -1"
                ),
                "InventoryRotateYaw"
        );
        return itemStack;
    }

    public static ItemStack rotatePitch() {
        ItemStack itemStack = new ItemStack(Material.SLIME_BALL);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Rotate vertically (pitch)",
                List.of(
                        ChatColor.GRAY + "Click to rotate the nearest",
                        ChatColor.GRAY + "unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to rotate by +1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to rotate by -1"
                ),
                "InventoryRotatePitch"
        );
        return itemStack;
    }

    public static ItemStack moveX() {
        ItemStack itemStack = new ItemStack(Material.SHEARS);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Move X (Teleport)",
                List.of(
                        ChatColor.GRAY + "Click to move the nearest",
                        ChatColor.GRAY + "unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move -0.1"
                ),
                "InventoryMoveX"
        );
        return itemStack;
    }

    public static ItemStack moveY() {
        ItemStack itemStack = new ItemStack(Material.SHEARS);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Move Y (Teleport)",
                List.of(
                        ChatColor.GRAY + "Click to move the nearest",
                        ChatColor.GRAY + "unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move -0.1"
                ),
                "InventoryMoveY"
        );
        return itemStack;
    }

    public static ItemStack moveZ() {
        ItemStack itemStack = new ItemStack(Material.SHEARS);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Move Z (Teleport)",
                List.of(
                        ChatColor.GRAY + "Click to move the nearest",
                        ChatColor.GRAY + "unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to move -0.1"
                ),
                "InventoryMoveY"
        );
        return itemStack;
    }

    public static ItemStack spawnItemDisplay() {
        ItemStack itemStack = new ItemStack(Material.DIAMOND);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Spawn item_display",
                List.of(
                        ChatColor.GRAY + "Right click to spawn a new",
                        ChatColor.GRAY + "item display entity at your position"
                ),
                "InventorySpawnItem"
        );
        return itemStack;
    }

    public static ItemStack spawnBlockDisplay() {
        ItemStack itemStack = new ItemStack(Material.GRASS_BLOCK);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Spawn block_display",
                List.of(
                        ChatColor.GRAY + "Right click to spawn a new",
                        ChatColor.GRAY + "block display entity at your position"
                ),
                "InventorySpawnBlock"
        );
        return itemStack;
    }

    public static ItemStack spawnTextDisplay() {
        ItemStack itemStack = new ItemStack(Material.OAK_SIGN);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Spawn text_display",
                List.of(
                        ChatColor.GRAY + "Right click to spawn a new",
                        ChatColor.GRAY + "text display entity at your position"
                ),
                "InventorySpawnText"
        );
        return itemStack;
    }

    public static ItemStack unlock() {
        ItemStack itemStack = new ItemStack(Material.MUSIC_DISC_11);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Unlock nearest display entity",
                List.of(
                        ChatColor.GRAY + "Right click to unlock the nearest locked",
                        ChatColor.GRAY + "display entity, making it editable again"
                ),
                "InventoryUnlock"
        );
        return itemStack;
    }

    public static ItemStack highlightTarget() {
        ItemStack itemStack = new ItemStack(Material.GLOWSTONE_DUST);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Highlight target",
                List.of(
                        ChatColor.GRAY + "Right click to highlight the display entity",
                        ChatColor.GRAY + "that will be targeted by your tools"
                ),
                "InventoryHighlight"
        );
        return itemStack;
    }

    public static ItemStack leftRotationX() {
        ItemStack itemStack = new ItemStack(Material.STICK);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Left Rotation X",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryLRX"
        );
        return itemStack;
    }

    public static ItemStack leftRotationY() {
        ItemStack itemStack = new ItemStack(Material.STICK);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Left Rotation Y",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryLRY"
        );
        return itemStack;
    }

    public static ItemStack leftRotationZ() {
        ItemStack itemStack = new ItemStack(Material.STICK);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Left Rotation Z",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryLRZ"
        );
        return itemStack;
    }

    public static ItemStack rightRotationX() {
        ItemStack itemStack = new ItemStack(Material.BLAZE_ROD);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Right Rotation X",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryRRX"
        );
        return itemStack;
    }

    public static ItemStack rightRotationY() {
        ItemStack itemStack = new ItemStack(Material.BLAZE_ROD);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Right Rotation Y",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryRRY"
        );
        return itemStack;
    }

    public static ItemStack rightRotationZ() {
        ItemStack itemStack = new ItemStack(Material.BLAZE_ROD);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Right Rotation Z",
                List.of(
                        ChatColor.GRAY + "Click to change the left rotation",
                        ChatColor.GRAY + "of the nearest unlocked display entity",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryRRZ"
        );
        return itemStack;
    }

    public static ItemStack centerPivot() {
        ItemStack itemStack = new ItemStack(Material.CHAIN);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Center Pivot Point",
                List.of(
                        ChatColor.GRAY + "Right click to auto adjust the translation",
                        ChatColor.GRAY + "so that the pivot is centered relative to the",
                        ChatColor.GRAY + "Scale. This will make it easier to rotate the",
                        ChatColor.GRAY + "entity around itself"
                ),
                "InventoryCenterPivot"
        );
        return itemStack;
    }

    public static ItemStack translationX() {
        ItemStack itemStack = new ItemStack(Material.NETHERITE_SCRAP);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Translation X",
                List.of(
                        ChatColor.GRAY + "Click to change the translation of",
                        ChatColor.GRAY + "the nearest unlocked display entity.",
                        ChatColor.GRAY + "Changing the translation will move the",
                        ChatColor.GRAY + "visual part of the entity but not its",
                        ChatColor.GRAY + "hitbox or pivot point",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryTX"
        );
        return itemStack;
    }

    public static ItemStack translationY() {
        ItemStack itemStack = new ItemStack(Material.NETHERITE_SCRAP);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Translation Y",
                List.of(
                        ChatColor.GRAY + "Click to change the translation of",
                        ChatColor.GRAY + "the nearest unlocked display entity.",
                        ChatColor.GRAY + "Changing the translation will move the",
                        ChatColor.GRAY + "visual part of the entity but not its",
                        ChatColor.GRAY + "hitbox or pivot point",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryTY"
        );
        return itemStack;
    }

    public static ItemStack translationZ() {
        ItemStack itemStack = new ItemStack(Material.NETHERITE_SCRAP);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Translation Z",
                List.of(
                        ChatColor.GRAY + "Click to change the translation of",
                        ChatColor.GRAY + "the nearest unlocked display entity.",
                        ChatColor.GRAY + "Changing the translation will move the",
                        ChatColor.GRAY + "visual part of the entity but not its",
                        ChatColor.GRAY + "hitbox or pivot point",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventoryTZ"
        );
        return itemStack;
    }

    public static ItemStack scaleX() {
        ItemStack itemStack = new ItemStack(Material.SHULKER_SHELL);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Scale X",
                List.of(
                        ChatColor.GRAY + "Click to change the scale of the",
                        ChatColor.GRAY + "nearest unlocked display entity.",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventorySX"
        );
        return itemStack;
    }

    public static ItemStack scaleY() {
        ItemStack itemStack = new ItemStack(Material.SHULKER_SHELL);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Scale Y",
                List.of(
                        ChatColor.GRAY + "Click to change the scale of the",
                        ChatColor.GRAY + "nearest unlocked display entity.",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventorySY"
        );
        return itemStack;
    }


    public static ItemStack scaleZ() {
        ItemStack itemStack = new ItemStack(Material.SHULKER_SHELL);
        Utilities.setMeta(itemStack, ChatColor.YELLOW + "Scale Z",
                List.of(
                        ChatColor.GRAY + "Click to change the scale of the",
                        ChatColor.GRAY + "nearest unlocked display entity.",
                        " ",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by +0.1",
                        ChatColor.YELLOW + String.valueOf(ChatColor.BOLD) + "SHIFT RIGHT-CLICK " + ChatColor.RESET + ChatColor.YELLOW + "to change by -0.1"
                ),
                "InventorySZ"
        );
        return itemStack;
    }
}