.class public final Ll4/n;
.super Ljava/lang/Object;

# interfaces
.implements Ll4/c;


# instance fields
.field public final a:Lja/m;

.field public final b:Ll4/j;


# direct methods
.method public constructor <init>(JLja/x;Lja/t;Lt9/c;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Ll4/n;->a:Lja/m;

    new-instance v6, Ll4/j;

    move-object v0, v6

    move-object v1, p4

    move-object v2, p3

    move-object v3, p5

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Ll4/j;-><init>(Lja/t;Lja/x;Lt9/c;J)V

    iput-object v6, p0, Ll4/n;->b:Ll4/j;

    return-void
.end method
