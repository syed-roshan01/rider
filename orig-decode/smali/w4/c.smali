.class public final Lw4/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/g;


# instance fields
.field public final synthetic a:Lm9/k;


# direct methods
.method public constructor <init>(Lm9/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/c;->a:Lm9/k;

    return-void
.end method


# virtual methods
.method public final d(Landroidx/lifecycle/w;)V
    .locals 1

    sget-object p1, Lq8/l;->a:Lq8/l;

    iget-object v0, p0, Lw4/c;->a:Lm9/k;

    invoke-interface {v0, p1}, Lu8/e;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
