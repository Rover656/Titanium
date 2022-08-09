/*
 * This file is part of Titanium
 * Copyright (C) 2022, Horizon Studio <contact@hrznstudio.com>.
 *
 * This code is licensed under GNU Lesser General Public License v3.0, the full license text can be found in LICENSE.txt
 */

package com.hrznstudio.titanium.block.tile;

public interface IScreenInfoProvider {
    default int getTitleColor() {
        return 0xFFFFFF;
    }

    default float getTitleXPos(float titleWidth, float screenWidth, float screenHeight, float guiWidth, float guiHeight) {
        return (screenWidth - guiWidth) / 2 + guiWidth / 2 - titleWidth / 2;
    }

    default float getTitleYPos(float titleWidth, float screenWidth, float screenHeight, float guiWidth, float guiHeight) {
        return ((screenHeight - guiHeight) / 2) + 6;
    }
}
