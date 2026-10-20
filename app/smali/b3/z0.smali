.class public final Lb3/z0;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:Lb3/g1;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(Lb3/g1;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lb3/z0;->a:Lb3/g1;

    iput-object p2, p0, Lb3/z0;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Lb3/z0;->a:Lb3/g1;

    iget-object v0, p1, Lb3/g1;->a:Lb3/f1;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lb3/f1;->c(F)V

    iget-object v0, p0, Lb3/z0;->b:Landroid/view/View;

    invoke-static {v0, p1}, Lb3/c1;->d(Landroid/view/View;Lb3/g1;)V

    return-void
.end method
