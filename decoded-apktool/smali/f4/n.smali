.class public final Lf4/n;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:Lq/f;

.field public final synthetic b:Lf4/q;


# direct methods
.method public constructor <init>(Lf4/q;Lq/f;)V
    .locals 0

    iput-object p1, p0, Lf4/n;->b:Lf4/q;

    iput-object p2, p0, Lf4/n;->a:Lq/f;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lf4/n;->a:Lq/f;

    invoke-virtual {v0, p1}, Lq/f;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf4/n;->b:Lf4/q;

    iget-object v0, v0, Lf4/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lf4/n;->b:Lf4/q;

    iget-object v0, v0, Lf4/q;->t:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
