package com.mascotcapsule.eruption.docomostar;

/* JADX INFO: loaded from: C:\Temp\jadx-6661938794004345591\classes.dex */
public interface NodeDeformerNode {
    void addSiblingNode(NodeDeformerNode nodeDeformerNode, Transform transform);

    NodeDeformer getParent();

    int getParentIndex();

    void getToWorldTransform(Transform transform);

    void getTransform(Transform transform);

    boolean isVisible();

    void mulScale(Vector3D vector3D);

    void removeFromParent();

    void setIdentity();

    void setRotateEuler(int i, Vector3D vector3D);

    void setTransform(Transform transform);

    void setTranslate(Vector3D vector3D);

    void setVisible(boolean z);
}
