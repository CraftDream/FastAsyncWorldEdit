/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.extension.platform;

import com.sk89q.worldedit.WorldEdit;
import com.sk89q.worldedit.util.io.ResourceLoader;
import com.sk89q.worldedit.util.io.WorldEditResourceLoader;
import com.sk89q.worldedit.world.DataFixer;
import com.sk89q.worldedit.world.World;

import java.util.Collections;
import java.util.List;

/**
 * An abstract implementation of {@link Platform}.
 */
public abstract class AbstractPlatform implements Platform {

    private final ResourceLoader resourceLoader = new WorldEditResourceLoader(WorldEdit.getInstance());

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    @Override
    public int schedule(long delay, long period, Runnable task) {
        return -1;
    }

    @Override
    public List<? extends World> getWorlds() {
        return Collections.emptyList();
    }

    @Override
    public DataFixer getDataFixer() {
        return null;
    }

    @Override
    public long getTickCount() {
        return System.nanoTime() / 50_000_000;
    }

}
