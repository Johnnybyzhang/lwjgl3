/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing barycentric support in fragment shaders that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>See <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-barycentric">Barycentric Interpolation</a> for more information.</p>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #fragmentShaderBarycentric};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FRAGMENTSHADERBARYCENTRIC;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FRAGMENTSHADERBARYCENTRIC = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports the {@code BaryCoordKHR} and {@code BaryCoordNoPerspKHR} SPIR-V fragment shader built-ins and supports the {@code PerVertexKHR} SPIR-V decoration on fragment shader input variables. */
    @NativeType("VkBool32")
    public boolean fragmentShaderBarycentric() { return nfragmentShaderBarycentric(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #fragmentShaderBarycentric} field. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR set(
        int sType,
        long pNext,
        boolean fragmentShaderBarycentric
    ) {
        sType(sType);
        pNext(pNext);
        fragmentShaderBarycentric(fragmentShaderBarycentric);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR set(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #fragmentShaderBarycentric}. */
    public static int nfragmentShaderBarycentric(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.FRAGMENTSHADERBARYCENTRIC); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #fragmentShaderBarycentric(boolean) fragmentShaderBarycentric}. */
    public static void nfragmentShaderBarycentric(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.FRAGMENTSHADERBARYCENTRIC, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#fragmentShaderBarycentric} field. */
        @NativeType("VkBool32")
        public boolean fragmentShaderBarycentric() { return VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nfragmentShaderBarycentric(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRFragmentShaderBarycentric#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR} value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#sType} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer sType$Default() { return sType(KHRFragmentShaderBarycentric.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#pNext} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR#fragmentShaderBarycentric} field. */
        public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.Buffer fragmentShaderBarycentric(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR.nfragmentShaderBarycentric(address(), value ? 1 : 0); return this; }

    }

}