package u1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements v1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f15146g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f15147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15152f;

    public k2(w wVar) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", wVar);
        this.f15147a = renderNodeCreate;
        if (f15146g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                q2 q2Var = q2.f15237a;
                q2Var.c(renderNodeCreate, q2Var.a(renderNodeCreate));
                q2Var.d(renderNodeCreate, q2Var.b(renderNodeCreate));
            }
            p2.f15211a.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f15146g = false;
        }
    }

    @Override // u1.v1
    public final void A(boolean z10) {
        this.f15147a.setClipToOutline(z10);
    }

    @Override // u1.v1
    public final void B(int i10) {
        boolean zC = e1.g0.c(i10, 1);
        RenderNode renderNode = this.f15147a;
        if (zC) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (e1.g0.c(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // u1.v1
    public final void C(float f10) {
        this.f15147a.setCameraDistance(-f10);
    }

    @Override // u1.v1
    public final boolean D() {
        return this.f15147a.isValid();
    }

    @Override // u1.v1
    public final void E(Outline outline) {
        this.f15147a.setOutline(outline);
    }

    @Override // u1.v1
    public final void F(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            q2.f15237a.d(this.f15147a, i10);
        }
    }

    @Override // u1.v1
    public final void G(float f10) {
        this.f15147a.setRotationX(f10);
    }

    @Override // u1.v1
    public final boolean H() {
        return this.f15147a.setHasOverlappingRendering(true);
    }

    @Override // u1.v1
    public final void I(Matrix matrix) {
        this.f15147a.getMatrix(matrix);
    }

    @Override // u1.v1
    public final float J() {
        return this.f15147a.getElevation();
    }

    @Override // u1.v1
    public final int a() {
        return this.f15151e - this.f15149c;
    }

    @Override // u1.v1
    public final int b() {
        return this.f15150d - this.f15148b;
    }

    @Override // u1.v1
    public final float c() {
        return this.f15147a.getAlpha();
    }

    @Override // u1.v1
    public final void d(float f10) {
        this.f15147a.setRotationY(f10);
    }

    @Override // u1.v1
    public final void e(float f10) {
        this.f15147a.setAlpha(f10);
    }

    @Override // u1.v1
    public final void f(int i10) {
        this.f15148b += i10;
        this.f15150d += i10;
        this.f15147a.offsetLeftAndRight(i10);
    }

    @Override // u1.v1
    public final int g() {
        return this.f15151e;
    }

    @Override // u1.v1
    public final int getLeft() {
        return this.f15148b;
    }

    @Override // u1.v1
    public final int getRight() {
        return this.f15150d;
    }

    @Override // u1.v1
    public final boolean h() {
        return this.f15152f;
    }

    @Override // u1.v1
    public final void i() {
    }

    @Override // u1.v1
    public final void j(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f15147a);
    }

    @Override // u1.v1
    public final int k() {
        return this.f15149c;
    }

    @Override // u1.v1
    public final void l(float f10) {
        this.f15147a.setRotation(f10);
    }

    @Override // u1.v1
    public final void m(float f10) {
        this.f15147a.setPivotX(f10);
    }

    @Override // u1.v1
    public final void n(float f10) {
        this.f15147a.setTranslationY(f10);
    }

    @Override // u1.v1
    public final void o(boolean z10) {
        this.f15152f = z10;
        this.f15147a.setClipToBounds(z10);
    }

    @Override // u1.v1
    public final boolean p(int i10, int i11, int i12, int i13) {
        this.f15148b = i10;
        this.f15149c = i11;
        this.f15150d = i12;
        this.f15151e = i13;
        return this.f15147a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // u1.v1
    public final void q(float f10) {
        this.f15147a.setScaleX(f10);
    }

    @Override // u1.v1
    public final void r(k.f fVar, e1.d0 d0Var, c9.c cVar) {
        int iB = b();
        int iA = a();
        RenderNode renderNode = this.f15147a;
        DisplayListCanvas displayListCanvasStart = renderNode.start(iB, iA);
        Canvas canvasV = fVar.y().v();
        fVar.y().w((Canvas) displayListCanvasStart);
        e1.d dVarY = fVar.y();
        if (d0Var != null) {
            dVarY.j();
            dVarY.t(d0Var, 1);
        }
        cVar.invoke(dVarY);
        if (d0Var != null) {
            dVarY.h();
        }
        fVar.y().w(canvasV);
        renderNode.end(displayListCanvasStart);
    }

    @Override // u1.v1
    public final void s() {
        p2.f15211a.a(this.f15147a);
    }

    @Override // u1.v1
    public final void t(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            q2.f15237a.c(this.f15147a, i10);
        }
    }

    @Override // u1.v1
    public final void u(float f10) {
        this.f15147a.setPivotY(f10);
    }

    @Override // u1.v1
    public final void v(float f10) {
        this.f15147a.setTranslationX(f10);
    }

    @Override // u1.v1
    public final void w(float f10) {
        this.f15147a.setScaleY(f10);
    }

    @Override // u1.v1
    public final void x(float f10) {
        this.f15147a.setElevation(f10);
    }

    @Override // u1.v1
    public final boolean y() {
        return this.f15147a.getClipToOutline();
    }

    @Override // u1.v1
    public final void z(int i10) {
        this.f15149c += i10;
        this.f15151e += i10;
        this.f15147a.offsetTopAndBottom(i10);
    }
}
