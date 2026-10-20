.class public final Lp9/p;
.super Ljava/lang/Object;

# interfaces
.implements Lp9/g;


# instance fields
.field public final synthetic a:Ld9/u;


# direct methods
.method public constructor <init>(Ld9/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/p;->a:Ld9/u;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lu8/e;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lp9/p;->a:Ld9/u;

    iput-object p1, p2, Ld9/u;->a:Ljava/lang/Object;

    new-instance p1, Lq9/a;

    invoke-direct {p1, p0}, Lq9/a;-><init>(Lp9/g;)V

    throw p1
.end method
