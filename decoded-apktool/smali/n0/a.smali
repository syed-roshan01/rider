.class public final Ln0/a;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ln0/i0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln0/i0;

    invoke-direct {v0}, Ln0/i0;-><init>()V

    iput-object v0, p0, Ln0/a;->a:Ln0/i0;

    return-void
.end method


# virtual methods
.method public final a(Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 1

    iget-object v0, p0, Ln0/a;->a:Ln0/i0;

    invoke-virtual {v0, p1, p2, p3}, Ln0/i0;->c(Lm0/d;Lm0/q2;Lm0/w;)V

    return-void
.end method
