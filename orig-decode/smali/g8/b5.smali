.class public final Lg8/b5;
.super Ljava/lang/Object;

# interfaces
.implements Lg8/y4;


# instance fields
.field public final synthetic a:Lg8/y2;


# direct methods
.method public constructor <init>(Lg8/y2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/b5;->a:Lg8/y2;

    return-void
.end method


# virtual methods
.method public final a(Lg8/g5;)V
    .locals 3

    iget-object v0, p1, Lg8/g5;->a:Lg8/h0;

    new-instance v1, Lg8/f5;

    iget-object v2, p0, Lg8/b5;->a:Lg8/y2;

    invoke-direct {v1, v2, p1}, Lg8/f5;-><init>(Lg8/y2;Lg8/g5;)V

    invoke-interface {v0, v1}, Lg8/h0;->j(Lg8/j0;)V

    return-void
.end method
